
package com.myservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MyCalculatorWS", targetNamespace = "http://myservice.com/", wsdlLocation = "http://localhost:8080/CalculatorWS/MyCalculatorWS?wsdl")
public class MyCalculatorWS_Service
    extends Service
{

    private final static URL MYCALCULATORWS_WSDL_LOCATION;
    private final static WebServiceException MYCALCULATORWS_EXCEPTION;
    private final static QName MYCALCULATORWS_QNAME = new QName("http://myservice.com/", "MyCalculatorWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CalculatorWS/MyCalculatorWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYCALCULATORWS_WSDL_LOCATION = url;
        MYCALCULATORWS_EXCEPTION = e;
    }

    public MyCalculatorWS_Service() {
        super(__getWsdlLocation(), MYCALCULATORWS_QNAME);
    }

    public MyCalculatorWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYCALCULATORWS_QNAME, features);
    }

    public MyCalculatorWS_Service(URL wsdlLocation) {
        super(wsdlLocation, MYCALCULATORWS_QNAME);
    }

    public MyCalculatorWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYCALCULATORWS_QNAME, features);
    }

    public MyCalculatorWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyCalculatorWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MyCalculatorWS
     */
    @WebEndpoint(name = "MyCalculatorWSPort")
    public MyCalculatorWS getMyCalculatorWSPort() {
        return super.getPort(new QName("http://myservice.com/", "MyCalculatorWSPort"), MyCalculatorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyCalculatorWS
     */
    @WebEndpoint(name = "MyCalculatorWSPort")
    public MyCalculatorWS getMyCalculatorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://myservice.com/", "MyCalculatorWSPort"), MyCalculatorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYCALCULATORWS_EXCEPTION!= null) {
            throw MYCALCULATORWS_EXCEPTION;
        }
        return MYCALCULATORWS_WSDL_LOCATION;
    }

}
