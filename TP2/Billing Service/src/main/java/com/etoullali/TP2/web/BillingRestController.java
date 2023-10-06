package com.etoullali.TP2.web;

import com.etoullali.TP2.entities.Bill;
import com.etoullali.TP2.feign.CustomerRestClient;
import com.etoullali.TP2.feign.ProductRestClient;
import com.etoullali.TP2.model.Product;
import com.etoullali.TP2.repositories.BillRepository;
import com.etoullali.TP2.repositories.ProductItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillingRestController {

    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;
    private ProductRestClient productRestClient;

    public BillingRestController(
            BillRepository billRepository,
            ProductItemRepository productItemRepository,
            CustomerRestClient customerRestClient,
            ProductRestClient productRestClient
            ) {
        this.billRepository = billRepository;
        this.productItemRepository = productItemRepository;
        this.customerRestClient = customerRestClient;
        this.productRestClient = productRestClient;
    }

    @GetMapping(path = "/fullBill/{id}")
    public Bill getBillById(@PathVariable(name = "id") Long id){
        Bill bill=billRepository.findById(id).get();
        bill.setCustomer(customerRestClient.getCustomerById(bill.getCustomerId()));
        bill.getProductItems().forEach(pi->{
            Product product=productRestClient.getProductById((pi.getProductId()));
            pi.setProduct(product);
        });
        return bill;
    }

    @GetMapping(path = "/findByCustomerId/{customerId}")
    public List<Bill> findByCustomerId(@PathVariable(name = "customerId") Long customerId){
        List<Bill> billList = billRepository.findByCustomerId(customerId);
        return billList;
    }
}
