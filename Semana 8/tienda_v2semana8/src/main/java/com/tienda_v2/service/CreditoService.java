
package com.tienda_v2.service;

import com.tienda_v2.domain.Credito;
import java.util.List;


public interface CreditoService {
    public List<Credito> getCreditos(boolean activos);
    
    public void save(Credito credito);
    
    public Credito getCredito(Credito credito);
    
    public void delete (Credito credito);
}
