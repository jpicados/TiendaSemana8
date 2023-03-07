
package com.tienda_v2.service.impl;

import com.tienda_v2.dao.CreditoDao;
import com.tienda_v2.domain.Credito;
import com.tienda_v2.service.CreditoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreditoServiceImpl implements CreditoService{
    @Autowired
    private CreditoDao creditoDao;
    
    @Override
    public List<Credito> getCreditos(boolean activos){
        var lista = (List<Credito>)creditoDao.findAll();
        if(activos){
            lista.removeIf( e->!e.isActivo());
        }
        return lista;
    }
    @Override
    public void save(Credito credito){
        creditoDao.save(credito);
    }
    @Override
    public void delete (Credito credito){
        creditoDao.delete(credito);
    }
    @Override
    public Credito getCredito(Credito credito){
        return creditoDao.findById(credito.getIdCredito()).orElse(null);
    }
}
