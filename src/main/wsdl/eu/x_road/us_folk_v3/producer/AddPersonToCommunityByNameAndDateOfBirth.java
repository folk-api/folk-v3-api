
package eu.x_road.us_folk_v3.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="request" type="{http://us-folk-v3.x-road.eu/producer}NameAndDateOfBirthParam"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "AddPersonToCommunityByNameAndDateOfBirth")
public class AddPersonToCommunityByNameAndDateOfBirth {

    @XmlElement(required = true)
    protected NameAndDateOfBirthParam request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndDateOfBirthParam }
     *     
     */
    public NameAndDateOfBirthParam getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndDateOfBirthParam }
     *     
     */
    public void setRequest(NameAndDateOfBirthParam value) {
        this.request = value;
    }

}
