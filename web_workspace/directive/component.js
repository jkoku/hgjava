// component.js 기본적으로 객체타입.

let component = {       //  컴포넌트는 객체
    //name : '',        //  컴포넌트 이름 (많은 컴포넌트가 있어서 고유의 이름을 구분하고 싶다면), 필수x 선택적인부분 
    template : ``,      //  View   (화면)백틱사용, 홑따옴표는 줄바꿈먹지않기때문에 사용 x
    data(){},           //  Data : CRUD 가능, 실제로 property 라 부름..?
    computed : {},      //  Data : Read만 가능. 직접수정불가 컴포넌트가 가진 데이터 의미하지만 읽기만 가능. 자동연산하는 데이터.ex.환율데이터
    methods : {},       //  Code : 기능정의. 이벤트핸들러, 함수들 전부 기능은 전부 여기. 자기 밖에 있는 함수를 인지하지 못한다. 
                        //         오로지 methods 밑에 함수만 인지.컴포넌트가 쓸 기능은 모두 여기를 거쳐야한다. 밖의 함수는 사용하려면 감싸주어여함.
    watch : {},         //  Data를 감시 -> 연속행위를 정의. 기능이 데이터랑 같이 움직여야할때 watch가 동작하면서 변경사항을 서버에 쏜다. 항상사용하는것은 아님. 자주사용 x
    components : {}     //  자식 컴포넌트들 추가 root component는 반드시 components가 필요하다.  내 안의 구성되는 컴포넌트 정보를 가져야한다. 
                        //       그 부분을 정의하는게 components. 내 내부에 정의된 것만 사용할 수 있기 때문에. root 컴포넌트 외에는 필수x
};
// 알아야할 기본적인 옵션은 다섯가지. template, data,computed,methods,watch


