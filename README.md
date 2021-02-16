# Solid (SRP, OCP, LSP, ISP, DIP)
* 객체지향 설계 5대 기본원리라고 할 수 있는 Solid 에 대해서 알아봅니다
* 5대 기본원리 또는 원칙이라고 알려져 있지만 항상 따라야 되는것은 아닙니다

## SRP (Single Responsibility Principle)
* 단일책임의 원리
```text
하나의 class 는 하나의 책임(하나의 object 특성)만 갖는다.
이는 method에도 동일하게 적용됩니다.
하나의 method 는 하나의 책임만 갖는다.
```

## OCP (Open Closed Principle)
* 개방폐쇄의 원리
```text
확장에 대해 열려(Open)야 하고, 수정에 대해서는 닫혀(Close)야 한다
완성된 class 또는 method 는 수정하지 않는다 (error는 제외)
error 이외에 기능의 추가 또는 수정시 extends를 통해 문제를 해결한다.
```

## LSP (Liskov Substitution Principle)
* 리스코프 치환의 원리
```text
파생 class는 상위 class로 대체 가능해야 한다
상위 class의 기능을 파생 class가 포함해야 한다
상위 class의 기본기능을 파생 class 가 침범해서는 안된다
확장되는 계층구조는 설계의도에 충실해야 된다.
```

## ISP (Interface Segregation Principle)
* 인터페이스 분리의 원리
```text
특화된 여러개의 인터페이스가 범용 인터페이스 한개 보다 낫다
ISP 또한 SRP 가 적용되야 한다 
하나의 Interface는 또한 하나의 책임만 지는 형태로 설계 되어야한다.
```

## DIP (Dependency Inversion Principle)
* 의존관계 역전의 원리
```text
추상화된것은 구체적인것에 의존하면 안된다.
변경될 소지가 있는 구현체라면 인터페이스에 의존해야 한다.
인터페이스를 받는 클라이언트 또한 구현체가 아닌 인터페이스에 의존해야한다.
구현체에 의존하는 순간 특정 코드와의 결합도가 강해지게 된다.
```
