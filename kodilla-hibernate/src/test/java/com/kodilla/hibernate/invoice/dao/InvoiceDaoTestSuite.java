package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        // dane faktury
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");

        productDao.save(product1);
        productDao.save(product2);

        Invoice invoice = new Invoice("123");

        Item item1 = new Item(product1, new BigDecimal("100.00"), 1, new BigDecimal("100.00"), invoice);
        Item item2 = new Item(product2, new BigDecimal("200.00"), 2, new BigDecimal("400.00"), invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        // zapis faktury
        invoiceDao.save(invoice);
        int id = invoice.getId();

        // weryfikacja poprawności
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        assertTrue(readInvoice.isPresent());

        // Usuwanie
        invoiceDao.deleteById(id);
        productDao.deleteById(product1.getId());
        productDao.deleteById(product2.getId());
    }
}