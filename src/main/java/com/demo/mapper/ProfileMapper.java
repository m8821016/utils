package com.demo.mapper;

import com.demo.from.FromProfile;
import com.demo.to.ToProfile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {RuleMapper.class})
public interface ProfileMapper {
    ProfileMapper MAPPER = Mappers.getMapper(ProfileMapper.class);

//    @Mappings({
//            @Mapping(source = "name", target = "name"),
//            @Mapping(source = "description", target = "description")
//    })
    ToProfile toToProfile(FromProfile toProfile);

    FromProfile tofromProfile(ToProfile toProfile);
}
