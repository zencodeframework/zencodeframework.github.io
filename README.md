<div align="center">
  <h1>🧘 ZenCode</h1>
  <p><b>Less boilerplate. More clarity. A modern annotation toolkit for Java developers.</b></p>

  <p>
    <img src="https://img.shields.io/badge/language-Java-blue.svg" />
    <img src="https://img.shields.io/badge/build-Maven-blue" />
    <img src="https://img.shields.io/badge/license-MIT-green" />
    <img src="https://img.shields.io/badge/status-alpha-orange" />
  </p>
</div>

---

## ✨ Features

- 🔨 `@ZenBuilder` – Auto-generate fluent builders for your classes
- 🔁 `@ZenMapper` – Create DTO ↔ Entity mappers with ease
- ⚡ Compile-time generation (no runtime overhead)
- 💡 Works with any Java project (Maven/Gradle)
- 🧩 Modular and extensible
- 🧘 Clean, readable, and maintainable code

---

## 🚀 Quick Start

### Add ZenCode to your project

```xml
<dependency>
  <groupId>io.github.zencodeframework</groupId>
  <artifactId>zencode-annotations</artifactId>
  <version>1.0-SNAPSHOT</version>
  <scope>provided</scope>
</dependency>
```

### Enable annotation processing

```xml
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.11.0</version>
  <configuration>
    <annotationProcessorPaths>
      <path>
        <groupId>io.github.zencodeframework</groupId>
        <artifactId>zencode-processor</artifactId>
        <version>1.0-SNAPSHOT</version>
      </path>
    </annotationProcessorPaths>
  </configuration>
</plugin>
```

---

## 🧱 Example: ZenBuilder

```java
@ZenBuilder
public class User {
    private String name;
    private int age;
}
```

```java
User user = UserBuilder.builder()
    .name("Alice")
    .age(25)
    .build();
```

---

## 🔁 Example: ZenMapper

```java
@ZenMapper(from = UserEntity.class, to = UserDTO.class)
public interface UserMapper {}
```

```java
UserDTO dto = UserMapperImpl.toUserDTO(new UserEntity(...));
```

---

## 📁 Project Structure

```
zencode/
├── zencode-core          # Shared utils (planned)
├── zencode-annotations   # Custom annotations
├── zencode-processor     # Annotation processors
├── zencode-examples      # Sample usage
├── zencode-docs          # Documentation & site (future)
```

---

## 🔮 Roadmap

- [ ] `@ZenRestController` – Generate Spring REST APIs from interfaces
- [ ] Mapper field customizers
- [ ] Gradle support
- [ ] IntelliJ plugin for previewing generated code

---

## 📜 License

Released under the [MIT License](LICENSE).

> Crafted with ☯️ by the ZenCode team
