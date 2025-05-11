package dev.zencode.examples;

import dev.zencode.annotations.ZenMapper;

@ZenMapper(from = UserEntity.class, to = UserDTO.class)
public interface UserMapper {}
