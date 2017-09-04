package br.com.provider.ws;

public class ServiceWSProxy implements br.com.provider.ws.ServiceWS {
  private String _endpoint = null;
  private br.com.provider.ws.ServiceWS serviceWS = null;
  
  public ServiceWSProxy() {
    _initServiceWSProxy();
  }
  
  public ServiceWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceWSProxy();
  }
  
  private void _initServiceWSProxy() {
    try {
      serviceWS = (new br.com.provider.ws.ServiceWSServiceLocator()).getServiceWSPort();
      if (serviceWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceWS != null)
      ((javax.xml.rpc.Stub)serviceWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.provider.ws.ServiceWS getServiceWS() {
    if (serviceWS == null)
      _initServiceWSProxy();
    return serviceWS;
  }
  
  public java.lang.String findNameByCode(int code) throws java.rmi.RemoteException{
    if (serviceWS == null)
      _initServiceWSProxy();
    return serviceWS.findNameByCode(code);
  }
  
  
}