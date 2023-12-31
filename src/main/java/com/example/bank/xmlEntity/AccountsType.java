//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.20 at 07:35:39 PM SAMT 
//


package com.example.bank.xmlEntity;

import lombok.Data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;


/**
 * <p>Java class for AccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccRstrList" type="{urn:cbr-ru:ed:v2.0}AccRstrListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Account" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegulationAccountType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CK" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountCBRBIC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateIn" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsType")
@Data
public class AccountsType {

//    @XmlElementRef(name = "AccRstrList", namespace = "urn:cbr-ru:ed:v2.0", type = JAXBElement.class, required = false)
//    @XmlMixed
    @XmlElement(name = "AccRstrList")
    protected List<AccRstrListType> content;
    @XmlAttribute(name = "Account")
    protected String account;
    @XmlAttribute(name = "RegulationAccountType")
    protected String regulationAccountType;
    @XmlAttribute(name = "CK")
    protected String ck;
    @XmlAttribute(name = "AccountCBRBIC")
    protected String accountCBRBIC;
    @XmlAttribute(name = "DateIn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateIn;
    @XmlAttribute(name = "AccountStatus")
    protected String accountStatus;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AccRstrListType }{@code >}
     * {@link String }
     * 
     * 
     */


    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the regulationAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationAccountType() {
        return regulationAccountType;
    }

    /**
     * Sets the value of the regulationAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationAccountType(String value) {
        this.regulationAccountType = value;
    }

    /**
     * Gets the value of the ck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCK() {
        return ck;
    }

    /**
     * Sets the value of the ck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCK(String value) {
        this.ck = value;
    }

    /**
     * Gets the value of the accountCBRBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCBRBIC() {
        return accountCBRBIC;
    }

    /**
     * Sets the value of the accountCBRBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCBRBIC(String value) {
        this.accountCBRBIC = value;
    }

    /**
     * Gets the value of the dateIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIn() {
        return dateIn;
    }

    /**
     * Sets the value of the dateIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIn(XMLGregorianCalendar value) {
        this.dateIn = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

}
