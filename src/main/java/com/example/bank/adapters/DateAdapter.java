package com.example.bank.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date unmarshal(String value) throws Exception {
        return FORMATTER.parse(value);
    }

    @Override
    public String marshal(Date value) throws Exception {
        return FORMATTER.format(value);
    }
}
