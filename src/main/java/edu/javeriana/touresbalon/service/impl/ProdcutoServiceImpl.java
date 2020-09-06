package edu.javeriana.touresbalon.service.impl;

import edu.javeriana.touresbalon.repository.ProductoRepository;
import edu.javeriana.touresbalon.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProdcutoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


}
