package edu.javeriana.touresbalon.service;

import edu.javeriana.touresbalon.model.PagoRequest;
import edu.javeriana.touresbalon.model.PagoResponse;

public interface PagoService {
    PagoResponse consultarFactura(Integer idConvenio, Integer referencia);

    PagoResponse pagarFactura(PagoRequest data);

    PagoResponse compensarFactura(PagoRequest data);
}
