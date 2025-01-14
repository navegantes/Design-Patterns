package com.nave.designpattern.proxy.solucao;

import com.nave.designpattern.builder.Pessoa;
import com.nave.designpattern.proxy.PessoaRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository implements ProxyPessoa {

    private static final Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private final Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada metodo save");
        super.save(pessoa);
        log.info("Chamadda metodo save finalizada");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada metodo findById");
        Long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))) {
            log.info("Pegando do cache.");
            pessoa = cache.get(id);
        } else {
            log.info("Pegado de PessoaRepository.");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }

        log.info("Chamada metodo findById finalizada");
        Long fim = System.currentTimeMillis();
        log.log(Level.INFO, "Tempo decorrido: {0}", fim - inicio);

        return pessoa;
    }

}
