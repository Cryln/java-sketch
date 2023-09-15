package org.example.zoo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author jiangmingjiang
 * @since 2023/9/15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Dog extends Animal<Human> {
}

