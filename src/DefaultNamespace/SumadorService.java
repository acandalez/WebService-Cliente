/**
 * SumadorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface SumadorService extends javax.xml.rpc.Service {
    public java.lang.String getSumadorAddress();

    public DefaultNamespace.Sumador getSumador() throws javax.xml.rpc.ServiceException;

    public DefaultNamespace.Sumador getSumador(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
