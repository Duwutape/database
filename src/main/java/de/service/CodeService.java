package de.service;

import de.model.User;
import org.fulib.yaml.IdMap;
import org.fulib.yaml.Yaml;
import org.fulib.yaml.YamlIdMap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CodeService {

    public void save(User user) {
       final String yaml = Yaml.encode(user);
        try {
            Files.createDirectories(Path.of("data"));
            Files.writeString(Path.of("data/user.yaml"), yaml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public User load(){
        try {
            final String yaml = Files.readString(Path.of("data/user.yaml"));
            final YamlIdMap idMap = new YamlIdMap(User.class.getPackageName());
            return (User) idMap.decode(yaml);
        } catch (IOException e) {
            return new User();
        }
    }
}
