db.createUser(
  {
    user: "vendas",
    pwd: "vendas",
    roles: [{ role: "readWrite", db: "vendas" }]
  }
);