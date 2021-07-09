
package eu.x_road.xsd.identifiers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for XRoadClientIdentifierType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="XRoadClientIdentifierType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://x-road.eu/xsd/identifiers}xRoadInstance"/&amp;gt;
 *         &amp;lt;element ref="{http://x-road.eu/xsd/identifiers}memberClass"/&amp;gt;
 *         &amp;lt;element ref="{http://x-road.eu/xsd/identifiers}memberCode"/&amp;gt;
 *         &amp;lt;element ref="{http://x-road.eu/xsd/identifiers}subsystemCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required""/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadClientIdentifierType")
public class XRoadClientIdentifierType
    extends XRoadIdentifierType
{


}
