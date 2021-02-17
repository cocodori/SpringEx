# ✏ Spring Study

## Version 1

### /board/list

![](https://images.velog.io/images/cocodori/post/c6fadc7e-90d8-4677-8168-6c82236421d0/image.png)

### /board/write

![](https://images.velog.io/images/cocodori/post/856b53e5-5eaa-497d-9aa1-425f74cf896e/image.png)

### /board/post

![](https://images.velog.io/images/cocodori/post/1e71ef0c-fb91-4c55-a808-5873f695f877/ezgif.com-video-to-gif.gif)

### post페이지에서 수정

![](https://images.velog.io/images/cocodori/post/3f9257b2-fc09-4a36-8ff5-e7ad223f1058/ezgif.com-video-to-gif%20(1).gif)

따로 수정 페이지를 만들지 않고 자바스크립트를 이용하여 조회 페이지에서 바로 수정할 수 있도록 했다.

### /board/remove

![](https://images.velog.io/images/cocodori/post/fa51338b-f0ba-4e32-a74a-ca2ccdd53373/ezgif.com-video-to-gif%20(2).gif)

모달 창을 쓸까, 말까 고민했지만 쓰지 않기로 했다. 네이버나, 페이스북 같은 웹에서 게시물을 삭제했을 때, 따로 삭제했다는 메세지 같은 것을 받은 기억이 없다. 따라서 굳이 필요한가... 있어도 되고 없어도 되는 기능이고, 없다고 사용자 입장에서 불편한 기능이 아니라고 판단해서 사용하지 않았다. 

> 코드가 궁금하다면 [참고](https://github.com/cocodori/SpringEx/tree/master/board/src/main/webapp/WEB-INF/views)

## 페이징

![](https://images.velog.io/images/cocodori/post/04944875-b313-47bb-8aa7-011f48027b14/ezgif.com-video-to-gif%20(3).gif)


게시글을 조회했다가, 다시 목록으로 돌아갈 때 원래의 페이지를 유지할 수 있도록 했다.
수정, 삭제 시에도 마찬가지로 원래 페이지를 유지한다.

## 검색

![](https://images.velog.io/images/cocodori/post/94d9b664-41e1-4c25-bcb1-4890db8de070/ezgif.com-video-to-gif%20(4).gif)

검색 조건을 유지하고 페이지 이동 가능. 게시물 조회, 수정 한 다음에도 정상 작동