//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.20 at 07:35:39 PM SAMT 
//


package com.example.bank.xmlEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParticipantInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RstrList" type="{urn:cbr-ru:ed:v2.0}RstrListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NameP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CntrCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Rgn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Tnp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nnp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Adr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateIn" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="PtType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Srvcs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XchType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParticipantStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PrntBIC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EnglName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantInfoType", propOrder = {
    "content"
})
public class ParticipantInfoType {

    @XmlElementRef(name = "RstrList", namespace = "urn:cbr-ru:ed:v2.0", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "NameP")
    protected String nameP;
    @XmlAttribute(name = "CntrCd")
    protected String cntrCd;
    @XmlAttribute(name = "Rgn")
    protected String rgn;
    @XmlAttribute(name = "Ind")
    protected String ind;
    @XmlAttribute(name = "Tnp")
    protected String tnp;
    @XmlAttribute(name = "Nnp")
    protected String nnp;
    @XmlAttribute(name = "Adr")
    protected String adr;
    @XmlAttribute(name = "DateIn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateIn;
    @XmlAttribute(name = "PtType")
    protected String ptType;
    @XmlAttribute(name = "Srvcs")
    protected String srvcs;
    @XmlAttribute(name = "XchType")
    protected String xchType;
    @XmlAttribute(name = "UID")
    protected String uid;
    @XmlAttribute(name = "ParticipantStatus")
    protected String participantStatus;
    @XmlAttribute(name = "RegN")
    protected String regN;
    @XmlAttribute(name = "PrntBIC")
    protected String prntBIC;
    @XmlAttribute(name = "EnglName")
    protected String englName;

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
     * {@link String }
     * {@link JAXBElement }{@code <}{@link RstrListType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the nameP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameP() {
        return nameP;
    }

    /**
     * Sets the value of the nameP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameP(String value) {
        this.nameP = value;
    }

    /**
     * Gets the value of the cntrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * Sets the value of the cntrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrCd(String value) {
        this.cntrCd = value;
    }

    /**
     * Gets the value of the rgn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgn() {
        return rgn;
    }

    /**
     * Sets the value of the rgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgn(String value) {
        this.rgn = value;
    }

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInd(String value) {
        this.ind = value;
    }

    /**
     * Gets the value of the tnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnp() {
        return tnp;
    }

    /**
     * Sets the value of the tnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnp(String value) {
        this.tnp = value;
    }

    /**
     * Gets the value of the nnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNnp() {
        return nnp;
    }

    /**
     * Sets the value of the nnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNnp(String value) {
        this.nnp = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
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
     * Gets the value of the ptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtType() {
        return ptType;
    }

    /**
     * Sets the value of the ptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtType(String value) {
        this.ptType = value;
    }

    /**
     * Gets the value of the srvcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvcs() {
        return srvcs;
    }

    /**
     * Sets the value of the srvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrvcs(String value) {
        this.srvcs = value;
    }

    /**
     * Gets the value of the xchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchType() {
        return xchType;
    }

    /**
     * Sets the value of the xchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchType(String value) {
        this.xchType = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the participantStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantStatus() {
        return participantStatus;
    }

    /**
     * Sets the value of the participantStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantStatus(String value) {
        this.participantStatus = value;
    }

    /**
     * Gets the value of the regN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegN() {
        return regN;
    }

    /**
     * Sets the value of the regN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegN(String value) {
        this.regN = value;
    }

    /**
     * Gets the value of the prntBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrntBIC() {
        return prntBIC;
    }

    /**
     * Sets the value of the prntBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrntBIC(String value) {
        this.prntBIC = value;
    }

    /**
     * Gets the value of the englName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglName() {
        return englName;
    }

    /**
     * Sets the value of the englName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglName(String value) {
        this.englName = value;
    }

}