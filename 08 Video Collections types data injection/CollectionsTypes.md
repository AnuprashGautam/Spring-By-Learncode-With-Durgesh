# Primitive Types

```xml
<property name=" ">
    <value> </value>
</property>
```


```xml
<property name=" " value=" ">
```

```xml
<bean p:property:value />
```

<br>
<br>

# Collection Types

## List

```xml
<bean>
    <property name=" ">

    <list>
        <value>10</value>
        <value>10</value>
        <value>10</value>
        <value>10</value>
    </list>

    </prperty>
</bean>
```

---

## Set

```xml
<bean>
    <property name=" ">

    <set>
        <value>10</value>
        <value>20</value>
        <value>30</value>
        <value>40</value>
    </set>

    </property>
</bean>
```

---

## Map

```xml
<bean>
    <property name=" ">

    <map>
        <entry key="java" value="2 month">
        <entry key="python" value="3 month">
    </map>

    </prperty>
</bean>
```

## Properties

```xml
<bean>
    <property>

        <props>
            <prop key="name">Anuprash</entry>
            <prop key="address">Meerut</entry>
        </props>

    </property>
</bean>
```

---

# Note

1. If we wnat to assign only 1 value to a list then so like this and we don't need to use the list tag.

```xml
<bean>
    <property name=" ">

    <vallue>11111</value>

    </property>
</bean>
```

2. If you want to add the ```null``` value to the list, then use this tag ```</null>```.





