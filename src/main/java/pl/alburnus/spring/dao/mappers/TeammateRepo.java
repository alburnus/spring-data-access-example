package pl.alburnus.spring.dao.mappers;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pl.alburnus.spring.model.Teammate;

import java.util.List;

public interface TeammateRepo {

    List<Teammate> getAllUsers();

    Teammate findById(@Param("id") Long id);

    // This will not cache, because select is here not in mapper xml
    @Select("SELECT * FROM teammate WHERE name = #{name}")
    Teammate finByName(@Param("name") String name);

    void create(Teammate teammate);
}
