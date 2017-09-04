/**
 * ServiceWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.provider.ws;

public class ServiceWSServiceLocator extends org.apache.axis.client.Service implements br.com.provider.ws.ServiceWSService {

    public ServiceWSServiceLocator() {
    }


    public ServiceWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceWSPort
    private java.lang.String ServiceWSPort_address = "http://localhost:8080/appProvider/ServiceWS";

    public java.lang.String getServiceWSPortAddress() {
        return ServiceWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceWSPortWSDDServiceName = "ServiceWSPort";

    public java.lang.String getServiceWSPortWSDDServiceName() {
        return ServiceWSPortWSDDServiceName;
    }

    public void setServiceWSPortWSDDServiceName(java.lang.String name) {
        ServiceWSPortWSDDServiceName = name;
    }

    public br.com.provider.ws.ServiceWS getServiceWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceWSPort(endpoint);
    }

    public br.com.provider.ws.ServiceWS getServiceWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.provider.ws.ServiceWSServiceSoapBindingStub _stub = new br.com.provider.ws.ServiceWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiceWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceWSPortEndpointAddress(java.lang.String address) {
        ServiceWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.provider.ws.ServiceWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.provider.ws.ServiceWSServiceSoapBindingStub _stub = new br.com.provider.ws.ServiceWSServiceSoapBindingStub(new java.net.URL(ServiceWSPort_address), this);
                _stub.setPortName(getServiceWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiceWSPort".equals(inputPortName)) {
            return getServiceWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.provider.com.br/", "ServiceWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.provider.com.br/", "ServiceWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceWSPort".equals(portName)) {
            setServiceWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
