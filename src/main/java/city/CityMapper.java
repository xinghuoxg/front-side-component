package city;

/**
 * @Description://TODO
 * @User: 62102.
 * @Contact: wechat: 13810414691
 * @Time: 2017/9/22.
 */
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


/**
 * @author Eddú Meléndez
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);

}