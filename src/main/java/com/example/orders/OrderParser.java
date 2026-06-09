package com.example.orders;
import java.util.List;

public interface OrderParser {
    List<Order> parse(List<String> lines);
}
