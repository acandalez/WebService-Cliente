package DefaultNamespace;

import java.rmi.RemoteException;

public class SumadorProxy implements DefaultNamespace.Sumador {
	private String _endpoint = null;
	private DefaultNamespace.Sumador sumador = null;

	public SumadorProxy() {
		_initSumadorProxy();
	}

	public SumadorProxy(String endpoint) {
		_endpoint = endpoint;
		_initSumadorProxy();
	}

	private void _initSumadorProxy() {
		try {
			sumador = (new DefaultNamespace.SumadorServiceLocator())
					.getSumador();
			if (sumador != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) sumador)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) sumador)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (sumador != null)
			((javax.xml.rpc.Stub) sumador)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public DefaultNamespace.Sumador getSumador() {
		if (sumador == null)
			_initSumadorProxy();
		return sumador;
	}

	public int suma(int a, int b) throws java.rmi.RemoteException {
		if (sumador == null)
			_initSumadorProxy();
		return sumador.suma(a, b);
	}

	public static void main(String[] args) {
		Sumador sm = new SumadorProxy();
		try {
			System.out.println(sm.suma(3, 5));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}