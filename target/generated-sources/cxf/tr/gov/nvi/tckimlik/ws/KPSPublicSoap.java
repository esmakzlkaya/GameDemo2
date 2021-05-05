package tr.gov.nvi.tckimlik.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-05T21:20:33.408+03:00
 * Generated source version: 3.4.3
 *
 */
@WebService(targetNamespace = "http://tckimlik.nvi.gov.tr/WS", name = "KPSPublicSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface KPSPublicSoap {

    @WebMethod(operationName = "TCKimlikNoDogrula", action = "http://tckimlik.nvi.gov.tr/WS/TCKimlikNoDogrula")
    @RequestWrapper(localName = "TCKimlikNoDogrula", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "tr.gov.nvi.tckimlik.ws.TCKimlikNoDogrula")
    @ResponseWrapper(localName = "TCKimlikNoDogrulaResponse", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "tr.gov.nvi.tckimlik.ws.TCKimlikNoDogrulaResponse")
    @WebResult(name = "TCKimlikNoDogrulaResult", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
    public boolean tcKimlikNoDogrula(

        @WebParam(name = "TCKimlikNo", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        long tcKimlikNo,
        @WebParam(name = "Ad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        java.lang.String ad,
        @WebParam(name = "Soyad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        java.lang.String soyad,
        @WebParam(name = "DogumYili", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        int dogumYili
    );
}
