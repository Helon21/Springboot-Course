package com.compassuol.estagio.springcourse.entities.pk;

import com.compassuol.estagio.springcourse.entities.Order;
import com.compassuol.estagio.springcourse.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order oder;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOder() {
        return oder;
    }

    public void setOder(Order oder) {
        this.oder = oder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(oder, that.oder) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oder, product);
    }
}
