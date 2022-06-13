const express = require('express')
const cors = require('cors')
const multer = require('multer')
const sharp = require('sharp')
const app = express()
app.use(cors())
const PORT = 3000

    const helperImg = (filePath, fileName, size = 300) =>{
        return sharp(filePath)
            .resize(size)
            .toFile(`./imgOptimizadas/${fileName}`)
    }

    const storage = multer.diskStorage({
        destination: (req, file, cb) => {
            cb(null, './imgOrig')
        },
        filename: (req, file, cb)=>{
            const ext = file.originalname.split('.').pop()
            cb(null, `${file.originalname}`)
        }
    })

    const upload = multer({ storage })
    app.post('/upload', upload.single('file'), (req, res)=>{
        console.log(req.file)
        helperImg(req.file.path, `micro-resize-${req.file.filename}`, 20)
        helperImg(req.file.path, `small-resize-${req.file.filename}`, 100)
        helperImg(req.file.path, `medium-resize-${req.file.filename}`, 500)
        helperImg(req.file.path, `large-resize-${req.file.filename}`, 1000)
        res.send({data: 'Imagen cargada'})
    })
    app.listen(PORT, () =>{
        console.log('Listo por el puerto', PORT)
    })
    
    app.use(express.static('public')); 
    app.use('/img', express.static('imgOptimizadas'));
