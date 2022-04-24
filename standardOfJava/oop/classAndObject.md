## 클래스와 객체

### 클래스와 객체의 정의와 용도

    클래스의 정의 - 클래스란 객체를 정의해 놓은 것이다.
    클래스의 용도 - 클래스는 객체를 생성하는데 사용된다.

    객체의 정의 - 실제로 존재하는 것, 사물 또는 개념
    객체의 용도 - 객체가 가지고 있는 기능과 속성에 따라 다름

    유형의 객체 - 책상, 의자, 자동차, TV와 같은 사물
    무형의 객체 - 수학공식, 프로그램 에러와 같은 논리나 개념

- 객체의 사전적인 정의는 '존재하는 것'이다.
- 객체지향이론에서는 사물과 같은 유형적인 것 뿐만 아니라, 개념이나 논리와 같은 무형적인 것들도 객체로 간주한다.
- 프로그래밍에서의 객체는 클래스에 정의된 내용대로 메모리에 생성된 것을 뜻한다.
- 객체를 사용한다는 것은 객체가 가지고 있는 속성과 기능을 사용한다는 뜻이다.

### 객체와 인스턴스

클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화(instantiate)라고 하며,  
어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스(instance)라고 한다.  
객체는 모든 인스턴스르를 대표하는 포괄적인 의미를 갖고 있다.

### 객체의 구성요소 - 속성과 기능

    속성(property) - 멤버변수(member variable), 특성(attribute), 필드(field), 상태(state)
    기능(function) - 메서드(mothod), 함수(function), 행위(behavior)

### 인스턴스의 생성과 사용

- 인스턴스를 다루기 위해서는 참조변수가 반드시 필요하다.
- 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.
- 자신을 참조하고 있는 참조변수가 하나도 없는 인스턴스는 더이상 사용되어 질 수 없으므로 가비지컬렉터에 의해 자동적으로 메모리에서 제거 된다.