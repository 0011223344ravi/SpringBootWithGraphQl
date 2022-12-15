# SpringBootWithGraphQl

type Query{

allUsers:[User]
getUser(userId:Int):User

}

type User{

    id:ID!
    name:String
    fatherName:String
    address:String



}

postman query :-

query{
    allUsers{
      name
      address

    }
}


query{
    getUser(userId :1){
      name
      address

    }
}
