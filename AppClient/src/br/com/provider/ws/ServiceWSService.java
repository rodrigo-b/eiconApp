/**
 * ServiceWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.provider.ws;

public interface ServiceWSService extends javax.xml.rpc.Service {
    public java.lang.String getServiceWSPortAddress();

    public br.com.provider.ws.ServiceWS getServiceWSPort() throws javax.xml.rpc.ServiceException;

    public br.com.provider.ws.ServiceWS getServiceWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
