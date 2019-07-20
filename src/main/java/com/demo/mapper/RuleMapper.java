package com.demo.mapper;

import com.demo.from.FromRule;
import com.demo.to.ToRule;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RuleMapper {

    RuleMapper MAPPER = Mappers.getMapper(RuleMapper.class);

    ToRule toToRule(FromRule fromRule);

    @InheritInverseConfiguration
    FromRule toFromRule(ToRule toRule);
}
