/**
 * SumadorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class SumadorServiceLocator extends org.apache.axis.client.Service
		implements DefaultNamespace.SumadorService {

	public SumadorServiceLocator() {
	}

	public SumadorServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public SumadorServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for Sumador
	private java.lang.String Sumador_address = "http://localhost:8082/HoyPublicador/services/Sumador";

	public java.lang.String getSumadorAddress() {
		return Sumador_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String SumadorWSDDServiceName = "Sumador";

	public java.lang.String getSumadorWSDDServiceName() {
		return SumadorWSDDServiceName;
	}

	public void setSumadorWSDDServiceName(java.lang.String name) {
		SumadorWSDDServiceName = name;
	}

	public DefaultNamespace.Sumador getSumador()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(Sumador_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getSumador(endpoint);
	}

	public DefaultNamespace.Sumador getSumador(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			DefaultNamespace.SumadorSoapBindingStub _stub = new DefaultNamespace.SumadorSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getSumadorWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setSumadorEndpointAddress(java.lang.String address) {
		Sumador_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (DefaultNamespace.Sumador.class
					.isAssignableFrom(serviceEndpointInterface)) {
				DefaultNamespace.SumadorSoapBindingStub _stub = new DefaultNamespace.SumadorSoapBindingStub(
						new java.net.URL(Sumador_address), this);
				_stub.setPortName(getSumadorWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("Sumador".equals(inputPortName)) {
			return getSumador();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://DefaultNamespace",
				"SumadorService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://DefaultNamespace",
					"Sumador"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("Sumador".equals(portName)) {
			setSumadorEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
