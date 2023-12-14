package com.baeldung.web.controller;

import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class InvoiceController {

    List<Invoice> invoiceList;

    @ModelAttribute("invoices")
    public void initInvoices() {
        invoiceList = new ArrayList<>();
    }

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("invoice/invoiceHome", "invoice", new Invoice());
    }


    @RequestMapping(value = "/addInvoice", method = RequestMethod.POST)
    public String submit(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("concept", invoice.getConcept());
        model.addAttribute("amount", invoice.getAmount());
        model.addAttribute("retention_percentage", invoice.getRetention_percentage());

        model.addAttribute("taxes_applied", calculate_taxes(invoice.getAmount(), invoice.getRetention_percentage()));
        model.addAttribute("total_amount", calculate_total(invoice.getAmount(), invoice.getRetention_percentage()));

        invoiceList.add(invoice);

        return "invoice/invoiceView";
    }

    private double calculate_taxes(double amount, int retention) {
        double taxes = amount * retention / 100;
        return Math.round(taxes * 100.0) / 100.0;
    }

    private double calculate_total(double amount, int retention) {
        double total = amount * (1 + ((double) retention / 100));
        return Math.round(total * 100.0) / 100.0;
    }

}
