//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.20 at 07:35:39 PM SAMT 
//


package com.example.bank.xmlEntity;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RstrListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RstrListType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Rstr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RstrDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RstrListType", propOrder = {
    "value"
})
@Data
public class RstrListType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Rstr")
    protected String rstr;
    @XmlAttribute(name = "RstrDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rstrDate;

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
     * Gets the value of the rstr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

    /**
     * Gets the value of the rstrDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */

}
