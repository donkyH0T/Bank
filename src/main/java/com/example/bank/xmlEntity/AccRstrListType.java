//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.20 at 07:35:39 PM SAMT 
//


package com.example.bank.xmlEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AccRstrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccRstrListType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="AccRstr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccRstrDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccRstrListType", propOrder = {
    "value"
})
public class AccRstrListType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "AccRstr")
    protected String accRstr;
    @XmlAttribute(name = "AccRstrDate")
    protected String accRstrDate;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the accRstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccRstr() {
        return accRstr;
    }

    /**
     * Sets the value of the accRstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccRstr(String value) {
        this.accRstr = value;
    }

    /**
     * Gets the value of the accRstrDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccRstrDate() {
        return accRstrDate;
    }

    /**
     * Sets the value of the accRstrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccRstrDate(String value) {
        this.accRstrDate = value;
    }

}