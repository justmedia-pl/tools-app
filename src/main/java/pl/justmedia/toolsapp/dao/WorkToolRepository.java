package pl.justmedia.toolsapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.justmedia.toolsapp.dao.entity.WorkTool;

@Repository
public interface WorkToolRepository extends CrudRepository<WorkTool,Long> {

}
