package pl.justmedia.toolsapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.justmedia.toolsapp.dao.WorkToolRepository;
import pl.justmedia.toolsapp.dao.entity.WorkTool;

import java.time.LocalDate;

import java.util.Optional;

@Service
public class WorkToolManager {

    private WorkToolRepository workToolRepository;

    @Autowired
    public WorkToolManager(WorkToolRepository workToolRepository){
        this.workToolRepository = workToolRepository;
    }

    public Optional<WorkTool> findById(Long id){
        return workToolRepository.findById(id);
    }

    public Iterable<WorkTool> findAll(){
        return workToolRepository.findAll();
    }

    public WorkTool save(WorkTool workTool){
        return workToolRepository.save(workTool);
    }

    public void deleteById(Long id){
        workToolRepository.deleteById(id);
    }

    @EventListener (ApplicationReadyEvent.class)
    public void fillDb(){
        save(new WorkTool(1L,"Miarka", LocalDate.of(2021,6,20)));
        save(new WorkTool(2L,"Miarka 2", LocalDate.of(2021,11,20)));
    }

}
