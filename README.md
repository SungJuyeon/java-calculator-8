### 구현할 기능 목록

- , : 를 기준으로 분리한 숫자의 합 계산
- //와 \n 사이 커스텀 구분자 지정
- 빈 문자열이면 0
- 사용자가 잘못된 값 입력 시 IllegalArgumentException
    - 음수 , 0
    - 구분자 외에 다른 문자열

### What (무엇을 구현할 것인가)

inputHandler : 사용자 입력을 받음

outputHandler : 결과 출력

customDelimiter : 구분자 처리

### Who (누가 처리할 것인가)

InputHandler : 입력 처리

OutputHandler : 출력 처리

DecisionDelimiter : 커스텀 구분자, 구분자 처리

Number : 숫자 합 계산