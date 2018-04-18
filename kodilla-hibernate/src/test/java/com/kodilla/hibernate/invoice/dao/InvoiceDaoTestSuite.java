package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDoaSave() {

        //Given
        Product product1 = new Product("Hammer");
        Product product2 = new Product("Screw driver");
        Product product3 = new Product("Spade");

        Item item1 = new Item(product1, new BigDecimal(12.99),
                3, new BigDecimal(38.97));
        Item item2 = new Item(product2, new BigDecimal(9.50),
                5, new BigDecimal(47.50));
        Item item3 = new Item(product3, new BigDecimal(25.00),
                3, new BigDecimal(75.00));

        Invoice invoice = new Invoice("001/2018");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
