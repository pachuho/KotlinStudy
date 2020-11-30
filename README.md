[Handler]
  - Handler의 종류
  
    1. interrupt handler : 인터럽트 접수에 대응하여 특정 기능을 처리하는 기계어 코드 루틴
    2. java.util.logging.handler : 자바 프로그램 진행 중 발생한 로그를 출력하는 방법을 다루는 클래스
    3. android.os.handler

  - Handler의 구조
  
    Looper + MessageQueue => Handler. 기본 생성자를 통해 Handler를 생성하면 새롭게 생성된 Handler는 해당 생성자가 호출된
    Thread의 MessageQueue, Looper에 자동으로 연결됨
    
    *val handler = Handler()는 디프리케이티드되어서 val handler = Handler(Looper.getMainLooper())를 사용한다

[ListView]
  * android.support deprecated 되어서 Refator Migrate to AndroidX 해주었음
  
  리스트뷰를 사용하기 위해 필요한 것
  1. Data Class
  2. XML에 리스트뷰 추가
  3. item 생성
  4. Adapter 생성
  5. Adapter 설정
  
[Fragment]

  supportFragmentManager.beginTransaction()
                .replace(R.id.view, OneFragment())
                .commit()
                
[RecyclerView]
  리스트뷰와 비슷하지만 ListView의 문제를 해결하기 위해 여러 형태로 커스텀할 수 있도록 제공된 툴
  
