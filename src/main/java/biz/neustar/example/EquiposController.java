package biz.neustar.example;

import biz.neustar.example.jooq.tables.daos.EquiposDao;
import biz.neustar.example.jooq.tables.pojos.Equipos;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static biz.neustar.example.jooq.tables.Equipos.EQUIPOS;

/**
 * Created by javierporras on 2/26/2016.
 */

@Controller
public class EquiposController {
    @Autowired
    DSLContext dslContext;

    @Autowired
    EquiposDao equiposDao;

    @RequestMapping("/equipo/test/add")
    public @ResponseBody String update(@ModelAttribute Equipos e){
        equiposDao.insert(e);
        return "<h2>Inserted record: </h2>" + dslContext
                .selectFrom(EQUIPOS)
                .where(EQUIPOS.EQUIPO.equal(e.getEquipo()))
                .fetch().formatHTML();
    }
}
