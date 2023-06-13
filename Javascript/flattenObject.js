const nestedObject = {
  label: "second",
  id: 2,
  children: [
    {
      label: "third",
      id: 3,
      children: [
        {
          label: "fifth",
          id: 5,
          children: [],
        },
        {
          label: "sixth",
          id: 6,
          children: [
            {
              label: "seventh",
              id: 7,
              children: [],
            },
          ],
        },
      ],
    },
    {
      label: "fourth",
      id: 4,
      children: [],
    },
  ],
};

function createFlattenObject(nestedObject, flattenData, parentKey) {
  for (let key in nestedObject) {
    let newParent = parentKey + key;
    let value = nestedObject[key];
    if (typeof value === "object") {
      createFlattenObject(value, flattenData, newParent + ".");
    } else {
      flattenData[newParent] = value;
    }
  }
  return;
}

function getFlattenObject() {
  const flattenData = {};
  createFlattenObject(nestedObject, flattenData, "");
  console.log(flattenData);
}
getFlattenObject();
