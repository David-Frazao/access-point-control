package com.accesspointcontrol.controller;

import com.accesspointcontrol.model.TipoData;
import com.accesspointcontrol.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipo-data")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }

    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataByID(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        return ResponseEntity.ok(tipoDataService.getById(idTipoData)
                .orElseThrow(() -> new NoSuchElementException("Tipo de Data não encontrada!")));
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity<TipoData> deleteTipoDataByID(@PathVariable("idTipoData") Long idTipoData){
        try{
            tipoDataService.deleteTipoData(idTipoData);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
}
