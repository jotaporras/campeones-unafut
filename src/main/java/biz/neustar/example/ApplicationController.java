package biz.neustar.example;

import biz.neustar.example.jooq.tables.Campeones;
import biz.neustar.example.jooq.tables.records.EquiposRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static biz.neustar.example.jooq.tables.Campeones.CAMPEONES;
import static biz.neustar.example.jooq.tables.Equipos.EQUIPOS;
import static org.jooq.impl.DSL.*;

/**
 * Created by javierporras on 2/25/2016.
 */

@Controller
public class ApplicationController {
    @Autowired
    DSLContext dslContext;

    @RequestMapping("/")
    public @ResponseBody String home(){
        Result<EquiposRecord> results = dslContext
            .selectFrom(EQUIPOS)
            .where(EQUIPOS.EQUIPO.equal("Deportivo Saprissa")
            .or(EQUIPOS.EQUIPO.equal("Herediano")))
            .or(EQUIPOS.EQUIPO.equal("Alajuelense"))
            .fetch();

        return results.formatHTML();
    }

    @RequestMapping("/demo")
    public @ResponseBody String demo(){
        String html = "";

        Result<Record2<String,Integer>> records  = dslContext
                .select(EQUIPOS.EQUIPO, count())
                .from(EQUIPOS)
                .innerJoin(CAMPEONES).on(CAMPEONES.CAMPEON_ID.equal(EQUIPOS.ID))
                .groupBy(EQUIPOS.ID)
                .orderBy(count().desc())
                .fetch();
        String papa = records.get(0).value1();

        return "<h1>El papa es: "+ papa +"</h1>" + records.formatHTML();
    }
}
