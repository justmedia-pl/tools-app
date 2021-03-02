package pl.justmedia.toolsapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.justmedia.toolsapp.dao.entity.WorkTool;
import pl.justmedia.toolsapp.manager.WorkToolManager;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tools")
public class WorkToolApi {

    private WorkToolManager workTools;

    @Autowired
    public WorkToolApi(WorkToolManager workTools) {
        this.workTools = workTools;
    }

    //GET Methods
    @GetMapping("/all")
    public Iterable<WorkTool> getAll() {
        return workTools.findAll();
    }

    @GetMapping()
    public Optional<WorkTool> getById(@RequestParam Long index) {
        //zamiast foreach stream !*
       return workTools.findById(index);
    }
    //POST Methods
    @PostMapping
    public WorkTool addTool(@RequestBody WorkTool workTool){
        return workTools.save(workTool);
    }
    //MODIFY Methods
    @PutMapping
    public WorkTool updateTool(@RequestBody WorkTool workTool){
        return workTools.save(workTool);
    }

    @DeleteMapping
    public void deleteTool(@RequestParam Long index){
        workTools.deleteById(index);
    }
}
