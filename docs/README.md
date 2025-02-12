## 📄 기능 목록

### 1. 게임 시작

- [x] 게임 시작 문구를 출력한다.

### 2. 다리 생성

- [x] 다리 길이 입력 문구를 출력한다.
- [x] 플레이어는 다리 길이 입력한다.
    - [x] `예외 처리` 입력값은 숫자이다.
- [x] 다리를 생성한다.
    - [x] `예외 처리` 다리 한 칸에는 위아래가 있다.
    - [x] 위아래로 된 다리를 생성한다.
    - [x] 다리의 위아래는 랜덤으로 생성된다.
    - [x] 다리의 길이는 플레이어가 입력한 값이다.
        - [x] `예외 처리` 다리의 길이는 3이상 20이하의 숫자이다.
- [x] 생성된 다리를 다리게임에 등록한다.

### 3. 다리 건너기

- [x] 이동할 칸 입력 문구를 출력한다.
- [x] 플레이어는 이동할 칸을 입력한다.
    - [x] `예외 처리` 위: U, 아래: D
    - [x] `예외 처리` 이동할 칸은 길이가 1인 문자열이다.
- [x] 플레이어가 선택한 칸으로 이동한다.
    - [x] 해당 칸으로 이동 가능한지 확인한다.
    - [x] 이동이 가능하면 해당 칸으로 이동하고 이동 기록을 갱신한다.
- [x] 이동 후 다리의 상태를 출력한다.
    - [x] 이동한 칸이 건널 수 있다면 O, 없다면 X를 표시한다.
    - [x] 이동하지 않은 칸은 공백으로 표시한다.
    - [x] 다리의 시작은 `[`, 다리의 끝은 `]`로 표시한다.
    - [x] 다리 칸의 구분은 `|`와 앞뒤 공백으로 표시한다.
    - [x] 이동 기록을 통해 현재까지 건넌 다리를 모두 출력한다.
- [x] 이동에 성공하면 다음 다리 건너기를 반복한다.
- [x] 이동에 실패하면 게임을 재시도 여부를 입력받는다.
    - [x] 게임을 재시도하면 기존 다리로 다리 건너기를 이어서 한다.
    - [x] `예외 처리` 재시도: R, 종료: Q
    - [x] 재시도 시점은 실패한 다리의 이전 칸에서 시도한다.
        - [x] 가장 최근 이동 기록을 삭제한다.
    - [x] 재시도하지 않을 경우 게임이 종료된다.
- [x] 다리를 모두 건너면 게임이 종료된다.

### 4. 게임 종료

- [x] 최종 게임 결과를 출력한다.
    - [x] 최종 다리의 상태를 출력한다.
    - [x] 다리 건너기 성공 여부를 출력한다.
        - [x] 다리를 모두 건넜다면 `성공`, 아니라면 `실패`이다.
    - [x] 총 시도한 횟수를 출력한다.
        - [x] 총 시도한 횟수는 현재 다리의 게임 시작과 재시도 횟수이다.
