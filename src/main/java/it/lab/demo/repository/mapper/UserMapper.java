package it.lab.demo.repository.mapper;

import it.lab.demo.model.UserDto;
import it.lab.demo.repository.entity.User;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserDto userDto);

    UserDto map(User user);

    List<UserDto> map(List<User> users);
}
